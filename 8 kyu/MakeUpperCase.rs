/*

MakeUpperCase

Write a function which converts the input string to uppercase.

*/

fn make_upper_case(s: &str) -> String {
   s.to_uppercase()
  // s.to_ascii_uppercase()
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_make_upper_case() {
        assert_eq!(make_upper_case("hello"), "HELLO");
    }
}
