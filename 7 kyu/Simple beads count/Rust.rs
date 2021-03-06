/*

Simple beads count

Two red beads are placed between every two blue beads. There are N blue beads.
After looking at the arrangement below work out the number of red beads.

@ @@ @ @@ @ @@ @ @@ @ @@ @

If there are less than 2 blue beads return 0.

*/


fn count_red_beads(n: u32) -> u32 {
    if n < 2 {
       return 0;
    }
    
    (n -1) * 2
}
            
#[test]
fn test() {
  assert_eq!(count_red_beads(0), 0);
  assert_eq!(count_red_beads(1), 0);
  assert_eq!(count_red_beads(3), 4);
  assert_eq!(count_red_beads(5), 8);
}
