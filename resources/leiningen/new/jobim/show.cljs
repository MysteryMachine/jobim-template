(ns {{name}}.show
  (:require [jobim.core :as jobim
             :refer [default-style ->Title]
             :refer-macros [defshow]]))

(defshow my-show
  default-style
  (->Title
   "{{name}}"
   [:a {:href "https://github.com/MysteryMachine/jobim"}] "jobim readme"))
