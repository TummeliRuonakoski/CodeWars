/*

Task:

Given a list of integers, determine whether the sum of its elements is odd or even.
Give your answer as a string matching "odd" or "even".
If the input array is empty consider it as: [0] (array with a zero).

*/

fn odd_or_even(numbers: Vec<i32>) -> String {
   if numbers.iter().sum::<i32>() %2 == 0{
       "even".to_string()
    }else{
        "odd".to_string()
    }
   
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_empty_array() {
        assert_eq!(odd_or_even(vec![]), "even");
    }
    #[test]
    fn test_single_even() {
        assert_eq!(odd_or_even(vec![0]), "even");
    }
    #[test]
    fn test_single_odd() {
        assert_eq!(odd_or_even(vec![1]), "odd");
    }
    #[test]
    fn test_even() {
        assert_eq!(odd_or_even(vec![0, 1, 5]), "even");
    }
    #[test]
    fn test_odd() {
        assert_eq!(odd_or_even(vec![0, 1, 4]), "odd");
    }
    #[test]
    fn test_negative_even() {
        assert_eq!(odd_or_even(vec![0, -1, -5]), "even");
    }
    #[test]
    fn test_negative_odd() {
        assert_eq!(odd_or_even(vec![0, -1, 2]), "odd");
    }
}
