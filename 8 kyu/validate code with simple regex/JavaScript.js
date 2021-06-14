function validateCode (code) {
  return /^[1-3]/.test(code);
}


describe("Basic tests",() =>{
Test.assertEquals(validateCode(123), true);
Test.assertEquals(validateCode(248), true);
Test.assertEquals(validateCode(8), false);
Test.assertEquals(validateCode(321), true);
Test.assertEquals(validateCode(9453), false);
})
