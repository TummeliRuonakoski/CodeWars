fn update_light(current: &str) -> String {
    match current {
        "green" => "yellow",
        "yellow" => "red",
        _ => "green"
    }.to_string()
}



fn update_light(current: &str) -> String {
   if current == "red"{
    return  "green".to_string();
   }
    if current == "green"{
    return  "yellow".to_string();
   }
    else{
      return "red".to_string();
  }
}

#[test]
fn basic_test() {
  assert_eq!(update_light("green"), "yellow");
  assert_eq!(update_light("yellow"), "red");
  assert_eq!(update_light("red"), "green");
}
