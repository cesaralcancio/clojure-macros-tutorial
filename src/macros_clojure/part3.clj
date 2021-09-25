(ns macros-clojure.part3)

; entender o &
(defn sum-10
  [& x]
  (println "somando 10 com:" x)
  (apply + (conj x 10)))
(sum-10 20 30 40)

; macro when
(when (> 3 2) (println "tres maior que dois") "tres maior que dois")
(macroexpand '(when (> 3 2) (println "tres maior que dois") "tres maior que dois"))
; mesmo que:
(if (> 3 2) (do (println "tres maior que dois") "tres maior que dois"))




(defmacro my-when
  [test & body]
  `(if ~test ~(cons 'do body)))
(my-when (> 3 2) (println "tres maior que dois") "tres maior que dois")
(macroexpand '(my-when (> 3 2) (println "tres maior que dois") "tres maior que dois"))







; como funciona o @?
(defmacro my-when-v2
  [test & body]
  `(if ~test (do ~@body)))
(my-when-v2 (> 3 2) (println "tres maior que dois") "tres maior que dois")
(macroexpand '(my-when-v2 (> 3 2) (println "tres maior que dois") "tres maior que dois"))
