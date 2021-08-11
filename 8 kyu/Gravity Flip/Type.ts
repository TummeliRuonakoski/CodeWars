export function flip(dir: string, arr: number[]): number[] {
  arr.sort((a, b) => a - b);
  if (dir === 'R') {
    return arr;
  } else {
    return arr.reverse();
  }
}






// See https://www.chaijs.com for how to use Chai.
import { assert } from "chai";
import { flip } from "./solution";

describe("Gravity Flip", () => {
  it("Sample tests", () => {
    assert.deepEqual(flip('R', [3, 2, 1, 2]), [1, 2, 2, 3]);
    assert.deepEqual(flip('L', [1, 4, 5, 3, 5]), [5, 5, 4, 3, 1]);
  });
});
