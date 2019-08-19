package stream.portfolio;

import com.kodilla.stream.portfolio.Board;
import com.kodilla.stream.portfolio.Task;
import com.kodilla.stream.portfolio.TaskList;
import com.kodilla.stream.portfolio.User;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.concurrent.TimeUnit.DAYS;
import static java.util.stream.Collectors.toList;

public class BoardTestSuite {
    public Board prepareTestData(){

        //users
        User user1 = new User("developer1", "John Smith");
        User user2 = new User("projectmanager1", "Nina White");
        User user3 = new User("developer2", "Emilia Stephanson");
        User user4 = new User("developer3", "Konrad Bridge");

        //tasks
        Task task1 = new Task("Microservice for taking temperature", "Write and test the microservice taking\n" + "the temperature from external serive", user1, user2, LocalDate.now().minusDays(20), LocalDate.now().plusDays(30));
        Task task2 = new Task("HQLs for analysis", "Prepare some HQL queries for analysis", user1, user2, LocalDate.now().minusDays(20), LocalDate.now().minusDays(5));
        Task task3 = new Task("Temperatures entity", "Prepare entity for temperatures", user3, user2, LocalDate.now().minusDays(20), LocalDate.now().plusDays(15));
        Task task4 = new Task("Own logger", "Refactor company logger to mmet our needs", user3, user2, LocalDate.now().minusDays(10), LocalDate.now().plusDays(25));
        Task task5 = new Task("Optimize searching", "Archive searching data to be optimized", user4, user2, LocalDate.now(), LocalDate.now().plusDays(5));
        Task task6 = new Task("Use streams", "use Streams rather than for-loops in predictions", user4, user2, LocalDate.now().minusDays(15), LocalDate.now().minusDays(2));

        //taskLists
        TaskList taskListToDo = new TaskList("To do");
        taskListToDo.addTask(task1);
        taskListToDo.addTask(task3);
        TaskList tasksInProgress = new TaskList("In progress");
        tasksInProgress.addTask(task5);
        tasksInProgress.addTask(task4);
        tasksInProgress.addTask(task2);
        TaskList taskListDone = new TaskList("Done");

        //board
        Board project = new Board("Project Weather Prediction");
        project.addTaskList(taskListToDo);
        project.addTaskList(tasksInProgress);
        project.addTaskList(taskListDone);
        return project;
    }
    @Test
    public void testAddTaskList(){
        //Given
        Board project = prepareTestData();

        //When

        //Then
        Assert.assertEquals(3, project.getTaskLists().size());
    }
    @Test
    public void testAddTaskListFindUserTasks(){
        //given
        Board project = prepareTestData();

        //when
        User user = new User("developer1", "John Smith");
        List<Task> tasks = project.getTaskLists().stream()
                .flatMap(l -> l.getTasks().stream())
                .filter(t -> t.getAssignedUser().equals(user))
                .collect(toList());
        //then
        Assert.assertEquals(2, tasks.size());
        Assert.assertEquals(user, tasks.get(0).getAssignedUser());
        Assert.assertEquals(user, tasks.get(1).getAssignedUser());
    }
    @Test
    public void testAddTaskListFindOutdatedTasks(){
        //Given
        Board project = prepareTestData();

        //When
        List<TaskList> undoneTasks = new ArrayList<>();
        undoneTasks.add(new TaskList("To do"));
        undoneTasks.add(new TaskList("In progress"));
        List<Task> tasks = project.getTaskLists().stream()
                .filter(undoneTasks::contains)
                .flatMap(tl -> tl.getTasks().stream())
                .filter(t -> t.getDeadline().isBefore(LocalDate.now()))
                .collect(toList());
        //Then
        Assert.assertEquals(1, tasks.size());
        Assert.assertEquals("HQLs for analysis", tasks.get(0).getTitle());
    }
    @Test
    public void testAddTaskListFindLongTasks(){
        //given
        Board project = prepareTestData();

        //when
        List<TaskList> inProgressTasks = new ArrayList<>();
        inProgressTasks.add(new TaskList("In progress"));
        long longTasks = project.getTaskLists().stream()
                .filter(inProgressTasks::contains)
                .flatMap(tl -> tl.getTasks().stream())
                .map(t-> t.getCreated())
                .filter(d -> d.compareTo(LocalDate.now().minusDays(10)) <= 0)
                .count();

        //then
        Assert.assertEquals(2, longTasks);
    }
    @Test
    public void testAddTaskListAverageWorkingOnTask(){

        //given
        Board project = prepareTestData();

        //when
        List<TaskList> inProgressTasks = new ArrayList<>();
        inProgressTasks.add(new TaskList("In progress"));
        double tasksBegan = project.getTaskLists().stream()
                .filter(inProgressTasks::contains)
                .flatMap(tl -> tl.getTasks().stream())
                .count();

        List<Integer> taskAvg = project.getTaskLists().stream()
                .filter(inProgressTasks::contains)
                .flatMap(w -> w.getTasks().stream())
                .map(w-> Period.between(w.getCreated(), LocalDate.now()).getDays())
                .collect(toList());

        long sum = 0;
        for (int i = 0; i < taskAvg.size(); i ++){
            sum += taskAvg.get(i);
        }
        long averageTotal = (long) (sum/tasksBegan);

        //then
        Assert.assertEquals((long)10, averageTotal);
    }
}