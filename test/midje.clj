(ns midje (:use [midje.sweet]))

(fact (+ 1 1) => 2)

(fact "addition has a unit element"
      (+ 12345 0) => 12345)

(fact "0 wad some Pow'r the giftie gie us. To see oursels as ithers see us!"
      => #"giftie")

(fact (+ 1 1) => even?)

(defn function-that-returns-a-collection []
  [4])

(fact (function-that-returns-a-collection)=> (contains 5)) 
