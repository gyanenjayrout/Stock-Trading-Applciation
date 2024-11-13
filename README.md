# Stock-Trading-Applciation


Question:
Suppose you're asked to create a system for a stock trading application. Traders can subscribe to price updates of certain stocks (Observer Pattern). Depending on the type of trade (e.g., market order, limit order), different algorithms might be used to execute trades (Strategy Pattern). A trading engine logs every action taken and ensures only one instance of the logger exists (Singleton Pattern). Different types of trades might also require creating specific trade processors (Factory Pattern). How would you design this system?

Stock Trading Application Design using Design Patterns
+-----------------+
|     Stock       |  <----- Subject (Observer Pattern)
+-----------------+
| - stockSymbol: String
| - price: double
| - observers: List<Observer>
+-----------------+
| + getPrice(): double
| + setPrice(price: double): void
| + attach(observer: Observer): void
| + detach(observer: Observer): void
| + notifyObservers(): void
+-----------------+


                   /|\       |
                    |        |
                    |        |
                 +--|--------|---+
                 |             |
+--------------------+       +-------------------+
| Trader (Observer) |       |   TradeProcessor  | <---- Factory Pattern
+--------------------+       +-------------------+
| - name: String     |       | + processTrade(): void
| + update(stockSymbol: String, price: double): void |   
+--------------------+


+-----------------------+
|    TradeProcessorFactory    | <--- Factory Pattern
+-----------------------+
| + getTradeProcessor(type: String): TradeProcessor |
+-----------------------+


                 /|\      |
                  |       |
                  |       |
          +-------|-------+ 
          |               |
+-------------------+     +-------------------+
| MarketOrderProcessor |   | LimitOrderProcessor |
+-------------------+     +-------------------+
| + processTrade(): void| | + processTrade(): void|
+-------------------+     +-------------------+


+--------------------+
|    Logger          | <---- Singleton Pattern
+--------------------+
| - instance: Logger
+--------------------+
| + getInstance(): Logger
| + log(message: String): void
+--------------------+


+-------------------+
|  TradeStrategy    | <---- Strategy Pattern
+-------------------+
| + execute(): void |
+-------------------+


           /|\     |
            |      |
            |      |
    +-------|------+-------+
    |              |       |
+-------------------+     +-------------------+
| MarketOrderStrategy |   | LimitOrderStrategy |
+-------------------+     +-------------------+
| + execute(): void  |    | + execute(): void |
+-------------------+     +-------------------+
