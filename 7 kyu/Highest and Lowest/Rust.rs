fn high_and_low(numbers: &str) -> String {
    
     let max = numbers.split_whitespace()
            .map(|s| s.parse::<i64>().unwrap())
            .max().unwrap();

    let min = numbers.split_whitespace()
            .map(|s| s.parse::<i64>().unwrap())
            .min().unwrap();
    
    
     format!( "{} {}", max,min)
    
}
              

 #[test]
fn sample_test() {
  assert_eq!("42 -9", high_and_low("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
}
