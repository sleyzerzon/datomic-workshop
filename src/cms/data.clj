(ns cms.data
  (:require [cms.domain.author :as au]))

(defn setup []
  (au/create "Siva" "s@e.com")
  (au/create "Amit" "a@e.com"))


;;(require '[cms.domain.author :as au] '[datomic.api :as api])