package com.searcher

import com.component.Attribute

class Searcher {
  private val attributeByType: HashMap<String, HashMap<String, ArrayList<Attribute>>> = HashMap()

  fun register(attribute: Attribute) {
    var attributeByID: HashMap<String, ArrayList<Attribute>>? = attributeByType.get(attribute.id)
    
    if (attributeByID == null) {
      attributeByID = HashMap<String, ArrayList<Attribute>>()
      attributeByType.put(attribute.id, attributeByID)
    }

    var attributes: ArrayList<Attribute>? = attributeByID.get(attribute.value)

    if (attributes == null) {
      attributes = ArrayList()
      attributeByID.put(attribute.value, attributes)
    }

    attributes.add(attribute)
  }

  fun search(type: String, value: String) : List<Attribute>? {
    return attributeByType.get(type)?.get(value)
  }
}