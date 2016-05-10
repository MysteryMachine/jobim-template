(ns {{name}}.show
  (:require [jobim.core :as jobim
             :refer [default-style title]
             :refer-macros [defshow]]))

(defshow my-show
  default-style
  (title
   "{{name}}"
   [:a {:href "https://github.com/MysteryMachine/jobim"}
    "jobim readme"]))
