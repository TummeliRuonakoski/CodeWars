
fn generate_shape(n: i32) -> String {
    ("+".repeat(n as usize)+"\n").repeat(n as usize).trim().to_string()
}

#[test]
fn sample_test() {
  assert_eq!(generate_shape(3), "+++\n+++\n+++");
}
