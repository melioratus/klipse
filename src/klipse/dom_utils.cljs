(ns klipse.dom-utils
  (:use-macros [purnam.core :only [? ! !>]])
  (:require 
    [goog.dom :as gdom]))


(defn create-div-after [element attrs]
    (let [div (gdom/createDom "div" (clj->js attrs) (gdom/createTextNode ""))]
      (gdom/insertSiblingAfter div element)
      div))


(defn value [element]
  (? element.value))

(defn add-event-listener [element event listener] 
  (!> element.addEventListener event listener))

