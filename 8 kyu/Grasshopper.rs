/*
Grasshopper - Terminal game move function

Terminal game move function

In this game, the hero moves from left to right. The player rolls the die and moves the number of spaces indicated by the die two times.

Create a function for the terminal game that takes the current position of the hero and the roll (1-6) and return the new position.

Example:
move(3, 6) should equal 15


*/

fn move_hero(position: u32, roll: u32) -> u32 {
    position + roll * 2
}

#[cfg(test)]
mod tests {
    use super::move_hero;
    
    #[test]
    fn sample_tests() {
        assert_eq!(move_hero(0, 4), 8);
    }
}
