function toTime(seconds) {
return Math.floor(seconds / 3600) + " hour(s) and " + Math.floor(seconds / 60  % 60) + " minute(s)";
}

describe("Tests", () => {
  it("test", () => {
Test.assertEquals(toTime(3600), '1 hour(s) and 0 minute(s)');
Test.assertEquals(toTime(3601), '1 hour(s) and 0 minute(s)');
Test.assertEquals(toTime(3500), '0 hour(s) and 58 minute(s)');
Test.assertEquals(toTime(323500), '89 hour(s) and 51 minute(s)');
Test.assertEquals(toTime(0), '0 hour(s) and 0 minute(s)');  
  });
});
