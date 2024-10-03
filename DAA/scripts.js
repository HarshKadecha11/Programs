let cash = 1000.00;
let stocks = 0;
let stockPrice = 0.00;
let simulationInterval;

const stockPriceElement = document.getElementById('stock-price');
const cashElement = document.getElementById('cash');
const stocksElement = document.getElementById('stocks');
const totalValueElement = document.getElementById('total-value');
const startButton = document.getElementById('start-btn');
const stopButton = document.getElementById('stop-btn');

function updateMarketData() {
    // Simulate real-time stock price changes
    stockPrice = (Math.random() * 100).toFixed(2);
    stockPriceElement.textContent = `Current Stock Price: $${stockPrice}`;
}

function updatePortfolio() {
    cashElement.textContent = `Cash: $${cash.toFixed(2)}`;
    stocksElement.textContent = `Stocks: ${stocks}`;
    totalValueElement.textContent = `Total Value: $${(cash + stocks * stockPrice).toFixed(2)}`;
}

function greedyAlgorithm() {
    // Buy if the stock price is below a certain threshold
    if (stockPrice < 50 && cash >= stockPrice) {
        let numStocksToBuy = Math.floor(cash / stockPrice);
        cash -= numStocksToBuy * stockPrice;
        stocks += numStocksToBuy;
    }
    // Sell if the stock price is above a certain threshold
    else if (stockPrice > 70 && stocks > 0) {
        cash += stocks * stockPrice;
        stocks = 0;
    }
    updatePortfolio();
}

function startSimulation() {
    startButton.disabled = true;
    stopButton.disabled = false;
    simulationInterval = setInterval(() => {
        updateMarketData();
        greedyAlgorithm();
    }, 1000);
}

function stopSimulation() {
    startButton.disabled = false;
    stopButton.disabled = true;
    clearInterval(simulationInterval);
}

startButton.addEventListener('click', startSimulation);
stopButton.addEventListener('click', stopSimulation);