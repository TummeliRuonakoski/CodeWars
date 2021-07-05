function makeUpperCase(str) {
  return str.toUpperCase();
}


describe("Basic Tests", function(){
  it("should pass the basic tests", function(){
    Test.assertEquals(makeUpperCase("hello"), "HELLO");
  });
});
