function sumStr(a,b) {
 return String(Number(a) + Number(b));
}



describe("Tests", () => {
  it("test", () => {
Test.assertEquals(sumStr("4","5"), "9");
Test.assertEquals(sumStr("34","5"), "39");
  });
});
