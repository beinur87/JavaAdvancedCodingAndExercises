package ro.sda.advanced._5_linkedlist;

public class StockMain {
    final static StockManager manager = new StockManager();

    public static void main(String[] args) {

        manager.addStock(new StockItem("bread", 2.5, 200));
        manager.addStock(new StockItem("salad", 5, 500));
        manager.addStock(new StockItem("phone", 5000, 50));

        manager.addStock(new StockItem("bread", 2.5, 1000));

        int breadReserved = manager.reserveStock("bread", 100);

        System.out.println("Reserved bread: " + breadReserved);

        int breadSold = 0;
        try {
            breadSold = manager.sellStock("bread", 100);
        } catch (UnavailableStockException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Sold bread: " + breadSold);


        try{
            manager.sellStock("phone", 500);
        } catch(RuntimeException | UnavailableStockException ex){
            System.out.println(ex.getMessage());
        }


    }
}
