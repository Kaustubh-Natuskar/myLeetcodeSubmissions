/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let minPrice = prices[0], max = 0;
    prices.forEach((price) => {
        if(price<minPrice){
            minPrice = price;
        }
        if(price-minPrice > max){
            max = price-minPrice
        }
    })
    return max;
};