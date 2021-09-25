(ns macros-clojure.part4)

; adiciona um print
(defmacro my-when-v1
  [test & body]
  `(if ~test (do (println "cesar") ~@body)))
(my-when-v1 (> 3 2) (println "tres maior que dois") "tres maior que dois")
(macroexpand '(my-when-v1 (> 3 2) (println "tres maior que dois") "tres maior que dois"))






;adiciona um let
(defmacro my-when-v2
  [test & body]
  `(if ~test (do (let [nome "cesar"] (println nome)) ~@body)))
(macroexpand '(my-when-v2 (> 3 2) (println "tres maior que dois") "tres maior que dois"))
(my-when-v2 (> 3 2) (println "tres maior que dois") "tres maior que dois")





;adiciona um let com simbolo aleatorio
(defmacro my-when-v3
  [test & body]
  (let [nome-symbol (gensym)]
    `(if ~test (do (let [~nome-symbol "cesar"] (println ~nome-symbol)) ~@body))))
(macroexpand '(my-when-v3 (> 3 2) (println "tres maior que dois") "tres maior que dois"))
(my-when-v3 (> 3 2) (println "tres maior que dois") "tres maior que dois")
















; utilizando o #
(defmacro my-when-v4
  [test & body]
  `(if ~test (do (let [nome# "cesar"] (println nome#)) ~@body)))
(macroexpand '(my-when-v4 (> 3 2) (println "tres maior que dois") "tres maior que dois"))
(my-when-v4 (> 3 2) (println "tres maior que dois") "tres maior que dois")
