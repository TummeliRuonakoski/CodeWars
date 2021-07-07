function countPositivesSumNegatives(input) {
  
   
    let len = 0;
    let sum = 0;
    const arr = [];

    if(input && input.length) {
      for(let i in input) {
        if(input[i] > 0) {
            len += 1;
        } else {
            sum += input[i];
        }
      }
      arr.push(len);
      arr.push(sum);
    }
    return arr;
}



const chai = require("chai");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Example tests", () => {
  it("Testing for fixed test 1", () => {
    let testData = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15];
    let actual = countPositivesSumNegatives(testData);
    let expected = [10, -65];
    assert.deepEqual(actual, expected);
  })
    
  it("Testing for fixed test 1", () => {
    let testData = [0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14];
    let actual = countPositivesSumNegatives(testData);
    let expected = [8, -50];    
    assert.deepEqual(actual, expected);
  });
});
