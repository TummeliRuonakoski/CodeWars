export function findAverage(array: number[]): number {
   var sum = 0;
    for (let i = 0 ; i < array.length ; i++){
      sum += array[i];
    }
    return sum / array.length;
}
                                     
                                     
import {findAverage} from "./solution";
import {assert} from "chai";

describe("solution", function(){
  it('should calculate avg of given numbers',() => {
    assert.strictEqual(findAverage([1,1,1]), 1);
  });
});
