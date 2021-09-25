(ns macros-clojure.part1)

;; As macros permitem estender a linguagem clojure com novas funcionalidades
;; Mas a função também não permite?
;; Qual diferença da função e da macro?

(defn my-func-v1
  "func documentation"
  [arg1 arg2 arg3]
  (println arg1 arg2 arg3)
  [arg1 arg2 arg3])

(defmacro my-macro-v1
  "macro documentation"
  [arg1 arg2 arg3]
  (println arg1 arg2 arg3)
  [arg1 arg2 arg3])

(my-func-v1 "cesar" "alcancio" 30)
(my-macro-v1 "cesar" "alcancio" 30)

(def nome "cesar")
(def year-birthday 1991)
(my-func-v1 nome "alcancio" (- 2021 year-birthday))
(my-macro-v1 nome "alcancio" (- 2021 year-birthday))


;; Qual diferença da função e da macro?
(defn my-func-v2
  "func documentation"
  [arg1 arg2 arg3]
  (println arg1 arg2 arg3)
  (list arg1 arg2 arg3))

(defmacro my-macro-v2
  "macro documentation"
  [arg1 arg2 arg3]
  (println arg1 arg2 arg3)
  (list arg1 arg2 arg3))

(my-func-v2 nome "alcancio" (- 2021 year-birthday))
; (my-macro-v2 nome "alcancio" (- 2021 year-birthday))

(my-func-v2 + 1 1)
(my-macro-v2 + 1 1)

(macroexpand '(my-macro-v2 + 1 1))
; o que significa esse apostrofo?