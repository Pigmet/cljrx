(ns cljrx.core
  (:require [clojure.string :as st])
  (:refer-clojure :exclude [+ *]))

;; should make this a library. 

(def word "\\w")

(def non-word "\\W")

(def whitespace "\\s")

(def non-whitespace "\\S")

(def number "\\d")

(def non-number "\\D")

(def lower "\\p{Lower}")

(def upper "\\p{Upper}")

(def alpha "\\p{Alpha}")

(def alnum "\\p{Alnum}")

(def punct "\\p{Punct}")

(def graph "\\p{Graph}")

(def anything ".")

(def word-boundary "\\b")

(def non-word-boundary "\\B")

(def end-of-line "$")

(def beginning-of-line "^")

(def dot "\\.")

(defn re [& args] (re-pattern (apply str args)))

(defn + [& args] (re-pattern (str  (apply str args) "+")))

(defn * [& args] (re-pattern (str  (apply str args) "*")))

(defn ? [& args] (re-pattern (str  (apply str args) "?")))







