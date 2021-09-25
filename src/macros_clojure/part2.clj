(ns macros-clojure.part2)

(def nome "Cesar")

; repl
; nome
; (quote nome)
; 'nome
; `nome

; listas
; (1 2 3)
; (list 1 2 3)
; (quote (1 2 3))
; '(1 2 3)
; `(1 2 3)

; listas com simbolos
(def number 10)
; (+ 10 number)
; (list + 10 number)
; (quote (+ 10 number))
; '(+ 10 number)
; `(+ 10 number)

; aqui é a utilidade do til ~, combinando com o `
; `(+ 10 ~number)

; resumo
; list cria uma lista com os valores
; quote/apostrofo cria uma lista com os simbolos
; crase cria uma lista com os simbolos, porém pode acessar os valores com o til
