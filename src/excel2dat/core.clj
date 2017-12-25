(ns excel2dat.core
  (:require [ontodev.excel :as xls])
  (:gen-class))

(defn excel2dat
  [file-path sheet-name column-names]
  (let [book (xls/load-workbook file-path)
        records (xls/read-sheet book sheet-name)]
    (println
    (->> (map #(select-keys % column-names) records)
         (map vals)
         (map (partial interpose "|"))
         (map (partial apply str))
         (interpose "\n")
         (apply str)))))

(defn -main
  [& args]
  (excel2dat
    (first args)
    (second args)
    (vec (map keyword (drop 2 args)))))
