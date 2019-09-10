package com.bycasseb.cucumber

import org.junit.runner.RunWith

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber

@RunWith(Cucumber::class)
@CucumberOptions(plugin = ["pretty"], features = ["src/test/features"])
class CucumberIT
