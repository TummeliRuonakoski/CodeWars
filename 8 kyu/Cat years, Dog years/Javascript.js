var humanYearsCatYearsDogYears = function(humanYears) {
  let c = 0;
  let d = 0;
  for (let i = 0; i <= humanYears; i++) {
    if(i == 1){
    c = 15;
    d = 15;
    }
    else if(i == 2){
    c += 9;
    d += 9;
    }
    else{
    c += 4;
    d += 5;
    }
  }
  
  return [humanYears,c,d];
}


describe("Example Tests", function() {

  it("one", function() {
    Test.assertSimilar(humanYearsCatYearsDogYears(1), [1,15,15]);
  });

  it("two", function() {
    Test.assertSimilar(humanYearsCatYearsDogYears(2), [2,24,24]);
  });

  it("ten", function() {
    Test.assertSimilar(humanYearsCatYearsDogYears(10), [10,56,64]);
  });

});


