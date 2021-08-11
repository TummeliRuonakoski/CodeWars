export function move(pos: number, roll: number) {
  return pos + roll * 2
}




import { assert } from "chai";
import { move } from "./solution";

describe("Fixed tests", () => {
  it("move(0, 4)", () => assert.strictEqual(move(0, 4), 8));
  it("move(3, 6)", () => assert.strictEqual(move(3, 6), 15));
  it("move(2, 5)", () => assert.strictEqual(move(2, 5), 12));
});
