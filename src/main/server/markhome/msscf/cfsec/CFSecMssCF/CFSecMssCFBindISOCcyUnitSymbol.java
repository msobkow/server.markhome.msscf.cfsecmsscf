
// Description: Java 11 MssCF Binding for ISOCcy Column UnitSymbol.

/*
 *	server.markhome.msscf.CFSec
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfsec.CFSecMssCF;

import java.math.*;
import java.sql.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import org.msscf.msscf.cfcore.MssCF.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import org.apache.commons.codec.binary.Base64;

/**
 *	CFSecMssCFBindISOCcyUnitSymbol binds ISOCcy.UnitSymbol
 *	as an instance of MssCFGenBindObj.
 */
public class CFSecMssCFBindISOCcyUnitSymbol
	extends MssCFGenBindObj
{
	private static final long serialVersionUID = 1L;

	public CFSecMssCFBindISOCcyUnitSymbol() {
		super();
	}

	public CFSecMssCFBindISOCcyUnitSymbol( MssCFEngine argEngine ) {
		super( argEngine,
			"any",
			null,
			"ISOCcy",
			"UnitSymbol" );
	}
	public Object getValueObject( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFBindISOCcyUnitSymbol.getValueObject() ";

		if( genContext == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"expandBody",
				1,
				"genContext" );
		}

		ICFLibAnyObj genDef = genContext.getGenDef();
		if( genDef == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"expandBody",
				1,
				"genContext.getGenDef()" );
		}

		String unitSymbol;
		if( genDef instanceof ICFSecISOCcyObj ) {
			unitSymbol = ((ICFSecISOCcyObj)genDef).getOptionalUnitSymbol();
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"expandBody",
				"genContext.getGenDef()",
				genDef,
				"ICFSecISOCcyObj" );
		}

		return( unitSymbol );
	}

	public String expandBody( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFBindISOCcyUnitSymbol.expandBody() ";

		if( genContext == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"expandBody",
				1,
				"genContext" );
		}

		ICFLibAnyObj genDef = genContext.getGenDef();
		if( genDef == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"expandBody",
				1,
				"genContext.getGenDef()" );
		}

		String ret;

		if( genDef instanceof ICFSecISOCcyObj ) {
			String unitSymbol = ((ICFSecISOCcyObj)genDef).getOptionalUnitSymbol();
			ret = unitSymbol;
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"expandBody",
				"genContext.getGenDef()",
				genDef,
				"ICFSecISOCcyObj" );
		}

		return( ret );
	}

}
