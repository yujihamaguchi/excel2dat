(defproject excel2dat "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [ontodev/excel "0.2.4"]]
  :main ^:skip-aot excel2dat.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
