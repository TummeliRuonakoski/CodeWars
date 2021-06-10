fn get_count(string: &str) -> usize {
   string.chars().filter(|&i| "aeiou".contains(i)).count()
}



#[test]
fn my_tests() {
  assert_eq!(get_count("abracadabra"), 5);
}
