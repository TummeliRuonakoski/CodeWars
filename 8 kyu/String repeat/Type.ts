export function repeatStr(n: number, s: string): string {
  return s.repeat(n);
}



import solution = require('./solution');

import {assert} from "chai";

describe("solution", function(){
  it("Tests", function(){
    assert.equal(solution.repeatStr(3, "*"), "***");
  });
});
