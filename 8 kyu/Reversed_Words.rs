/*

Reversed Words

Complete the solution so that it reverses all of the words within the string passed in.

Example:
"The greatest victory is that which requires no battle" --> "battle no requires which that is victory greatest The"

*/

fn reverse_words(str:&str) -> String {
    str.split_whitespace().rev().collect::<Vec<&str>>().join(" ")
}


#[cfg(test)]
mod tests {
    use super::reverse_words;
    #[test]
    fn returns_expected() {
      assert_eq!(reverse_words("hello world!"), "world! hello");
    }
}
