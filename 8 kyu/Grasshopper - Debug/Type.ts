export function weatherInfo(temp: number): string {
  const c: number = convertToCelsius(temp);
  if (c < 0) {
    return c + " is freezing temperature";
  } else {
    return c + " is above freezing temperature";
  }
}

function convertToCelsius(fahrenheit : number): number {
  return Math.round(((fahrenheit - 32) * (5 / 9)) * 1e5) / 1e5;
}
             
     
            
import { assert } from "chai";
import { weatherInfo } from "./solution";

describe("Celsius converter", () => {
  it("should get correct answer", () => {
    assert.equal(weatherInfo(50), '10 is above freezing temperature');
    assert.equal(weatherInfo(23),  '-5 is freezing temperature');
  });
});
             
    
