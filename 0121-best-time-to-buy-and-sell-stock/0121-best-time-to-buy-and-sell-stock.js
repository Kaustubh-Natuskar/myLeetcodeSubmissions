/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let cheapest = prices[0], maxPrice = 0;
    prices.forEach((current) => {
        if (current < cheapest){
            cheapest = current;
        }
        if (current - cheapest > maxPrice) {
            maxPrice = current - cheapest;
        }
    });
    return maxPrice;
};