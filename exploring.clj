
; Simple function
(defn greeting1
    "Returns a greeting of the form 'Hello, username.'"
    [username]
    (str "Hello, " username))

; Function with zero-argument
(defn greeting2
    "Returns a greeting of the form 'Hello, username.'
    Default username is 'world'."
    ([] (greeting "world"))
    ([username] (str "Hello, " username)))

; Function with a sequence of parameters
(defn date [person-1 person-2 & chaperones]
    (println person-1 " and " person-2
        " went out with " (count chaperones) " chaperones."))

; Anonymous function
(require '[clojure.string :as str])
(filter (fn [w] (> (count w) 2)) (str/split "A fine day it is" #"\W+"))

