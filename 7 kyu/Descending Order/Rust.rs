fn descending_order(x: u64) -> u64 {
   let mut s: Vec<char> = x.to_string().chars().collect::<Vec<char>>();
    s.sort_by(|i, o| o.cmp(i));
   s.into_iter().collect::<String>().parse().unwrap()
 
}
     
use itertools::*;
fn descending_order(x: u64) -> u64 {
     x.to_string().chars().sorted().rev().collect::<String>().parse::<u64>().unwrap()
}


#[test]
fn returns_expected() {
    assert_eq!(descending_order(0), 0);
    assert_eq!(descending_order(1), 1);
    assert_eq!(descending_order(15), 51);
    assert_eq!(descending_order(1021), 2110);
    assert_eq!(descending_order(123456789), 987654321);
    assert_eq!(descending_order(145263), 654321);
    assert_eq!(descending_order(1254859723), 9875543221);
}
