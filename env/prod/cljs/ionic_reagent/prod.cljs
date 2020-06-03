(ns ionic-reagent.prod
  (:require [ionic-reagent.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
