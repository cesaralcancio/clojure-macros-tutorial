(ns macros-clojure.part5)

; execute only when the number is ímpar
(odd? 3)

(defmacro
  when-odd
  [number & body]
  `(if (odd? ~number) (do ~@body)))

(when-odd 2 (println "this number is odd") "this number is odd")
(when-odd 3 (println "this number is odd") "this number is odd")
