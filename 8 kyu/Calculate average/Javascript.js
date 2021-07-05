function find_average(array) {
 var sum = 0;
    for (var i = 0 ; i < array.length ; i++){
      sum += array[i];
    }
    return sum / array.length;
  
}


const chai = require("chai");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Basic tests", () => {
  it("Testing for fixed tests", () => {
    assert.strictEqual(find_average([1,1,1]), 1);
    assert.strictEqual(find_average([1,2,3]), 2);
    assert.strictEqual(find_average([1,2,3,4]), 2.5);
  });
}); 
