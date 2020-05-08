(ns cloverage-debugging.core-test
  (:require [clojure.test :refer :all]
            [cloverage-debugging.core :refer :all]))

(deftest record-name-test
  (is (= "Skyline Pigeon"
         (record-name (record-with-name "Skyline Pigeon")))))
