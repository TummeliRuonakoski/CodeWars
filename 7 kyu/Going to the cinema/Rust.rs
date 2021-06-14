fn movie(card: i32, ticket: i32, perc: f64) -> i32 {
    let mut a = 0.0;
    let mut b = 0.0;
    let mut count = 0;

    while (b + card as f64).ceil() >= a{
      a += ticket as f64;
      b = (b + ticket as f64) * perc;
      count += 1;
    }
        

    count as i32
}


#[cfg(test)]
    mod tests {
    use super::*;

    fn dotest(card: i32, ticket: i32, perc: f64, exp: i32) -> () {
        println!(" card: {:?};", card);
        println!("ticket: {:?};", ticket);
        println!("perc: {:?};", perc);
        let ans = movie(card, ticket, perc);
        println!("actual:\n{:?};", ans);
        println!("expect:\n{:?};", exp);
        println!(" {};", ans == exp);
        assert_eq!(ans, exp);
        println!("{};", "-");
    }

    #[test]
    fn basic_tests() {
        dotest(500, 15, 0.9, 43);
        dotest(100, 10, 0.95, 24);
        dotest(0, 10, 0.95, 2);
        
    }
}
