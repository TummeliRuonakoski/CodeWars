export function nthEven(n: number) {
  return (n - 1) * 2
}


import { assert } from "chai";
import { nthEven } from "./solution";

describe("Fixed tests", function() {
  it("Testing for 1", () => assert.strictEqual(nthEven(1), 0));
  it("Testing for 2", () => assert.strictEqual(nthEven(2), 2));
  it("Testing for 3", () => assert.strictEqual(nthEven(3), 4));
  it("Testing for 100", () => assert.strictEqual(nthEven(100), 198));
  it("Testing for 1298734", () => assert.strictEqual(nthEven(1298734), 2597466));
});
