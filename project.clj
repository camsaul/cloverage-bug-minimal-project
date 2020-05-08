(defproject cloverage-debugging "0.1.0-SNAPSHOT"
  :dependencies
  [[org.clojure/clojure "1.10.1"]
   [cloverage "1.1.2"]
   [potemkin "0.4.5" :exclusions [riddley]]]

  :plugins
  [[lein-cloverage  "1.1.2"]])
