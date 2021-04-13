/*

Reversed Strings

Complete the solution so that it reverses the string passed into it.
'world'  =>  'dlrow'

*/

fn solution(phrase: &str) -> String {
    phrase.chars().rev().collect::<String>()
}
