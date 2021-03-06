(use '(incanter core stats charts))

(def n 10000)

(def initial-guesses (sample [1 2 3] :size n))
(def prize-doors (sample [1 2 3] :size n))
(def switches (sample [true false] :size n))

(defn switch-win? [initial-guess switch prize-door]
  (if (and switch (not= initial-guess prize-door)) 1 0))

(defn stay-win? [initial-guess switch prize-door]
  (if (and (not switch) (= initial-guess prize-door)) 1 0))

(def prob-switch-win (/ (sum (map switch-win?
                                  initial-guesses
                                  switches
                                  prize-doors))
                        n))

(def prob-switch (/ (sum (indicator true? switches)) n))

(def prob-win-given-switch (/ prob-switch-win prob-switch))

(def prob-stay-win (/ (sum (map stay-win?
                                initial-guesses
                                switches
                                prize-doors))
                      n))

(def prob-stay (/ (sum (indicator false? switches)) n))

(def prob-win-given-stay (/ prob-stay-win prob-stay))

(view
 (pie-chart ["Switch" "Stay"]
            [prob-win-given-switch prob-win-given-stay]))
