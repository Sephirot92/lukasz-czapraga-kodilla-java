package com.kodilla.good.patterns.challenges.food2door;

import static com.kodilla.good.patterns.challenges.food2door.ContractorFactory.GLUTEN_FREE_SHOP;

public class Application {
    public static void main(String[] args) {
        OrderDTO orderDTO = new OrderDTO("Avocado", 20);

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.buyProcess(GLUTEN_FREE_SHOP , orderDTO);

    }
}
