(ns cloverage-debugging.core
  (:require [potemkin.types :as p.types]))

(p.types/defrecord+ VinylRecord [])

(defn record-name [m]
  (:name m))

(defn record-with-name [nme]
  (map->VinylRecord {:name nme}))
