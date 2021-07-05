function checkAlive (health) {
  if (health > 0) {
    return true;
  }else{
    return false;
  }
}

describe("Tests", () => {
  it("test", () => {
    Test.assertEquals(checkAlive(5), true)
    Test.assertEquals(checkAlive(0), false)
  });
});

